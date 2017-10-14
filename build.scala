import cbt._

class Build(val context: Context) extends BaseBuild {
  override def defaultScalaVersion = "2.12.3"
}