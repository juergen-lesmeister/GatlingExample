//package GatlingExample

import io.gatling.core.scenario.Simulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class BasicSimulation extends Simulation {
  val httpConf = http.baseURL("http://www.yahoo.com/")

  var scn = scenario("Basic Simulation")
    .exec(http("request_1").get("/"))

  setUp (
    scn.inject(atOnceUsers(1))
  ).protocols(httpConf)
}