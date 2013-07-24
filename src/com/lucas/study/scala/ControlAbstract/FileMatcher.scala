package com.lucas.study.scala.ControlAbstract

import java.io.File

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-24
 * Time: 上午11:11
 * To change this template use File | Settings | File Templates.
 */
object FileMatcher {
  private def filesHere = (new File(("."))).listFiles
/*  def filesEnding(query:String) =
    for (file <- filesHere; if file.getName.endsWith("query"))
       yield file

  def filesContaining(query :String) =
    for (file <- filesHere; if file.getName.contains(query))
      yield file

  def filesRegex(query:String) =
    for (file <- filesHere;if file.getName.matches(query))
      yield file*/

  def filesMatching(query:String, matcher:(String,String) => Boolean) ={
    for (file <- filesHere; if matcher(file.getName,query))
      yield file
  }

  def filesEndings(query:String) =
    filesMatching(query,_.endsWith(_))

  def fileContainingS(query:String) =
    filesMatching(query, _.contains(_))

  def filesRegexS(query:String) =
    filesMatching(query,_.matches(_))

}
