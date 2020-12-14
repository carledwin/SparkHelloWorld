import org.apache.spark.sql.SparkSession

object SparkScalaDemo {

  def main(args: Array[String]): Unit = {

    println("Hello Spark Scala!!!")

    //loading libs of hadoop to windows from C:\hadoop\bin\winutils.exe
    System.setProperty("hadoop.home.dir", "C:\\hadoop")

    //Create a Spark Session
    val spark = SparkSession
      .builder()
      .appName("HelloSparkScala")
      .config("spark.master", "local")
      .getOrCreate()

    println("Created SparkSession")
    val sampleSeq = Seq((1, "spark"), (2, "Big Data"))

    println("Created Seq")
    val df = spark.createDataFrame(sampleSeq).toDF("course id", "course name")
    println("Created Data Frame")
    df.show()


  }
}
