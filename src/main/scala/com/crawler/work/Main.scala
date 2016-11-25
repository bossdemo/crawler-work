package com.crawler.work

import akka.actor.ActorSystem

/**
  * Created by tongtao.zhu on 2016/11/25.
  */
object Main {
  def main(args: Array[String]) {
    // Create an Akka system
    val system = ActorSystem("ClusterSystem")
    println(111)
  }
}
