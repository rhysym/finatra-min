package server

import com.twitter.finatra.http.HttpServer
import com.twitter.finatra.http.routing.HttpRouter
import controller.PingController

class ApiServer extends HttpServer {
  override protected def configureHttp(router: HttpRouter): Unit = router
    .add[PingController]
}
