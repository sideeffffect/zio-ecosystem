package org.ziverge.ecosystem

import upickle.default.{macroRW, ReadWriter as RW, *}

enum ScalaVersion(val mvnFriendlyVersion: String):
  case V2_11 extends ScalaVersion("2.11")
  case V2_12 extends ScalaVersion("2.12")
  case V2_13 extends ScalaVersion("2.13")
  case V3 extends ScalaVersion("3")
  implicit val rw: RW[ScalaVersion] = macroRW

object ScalaVersion:
  implicit val rw: RW[ScalaVersion] = macroRW
