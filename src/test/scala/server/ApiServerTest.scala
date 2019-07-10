package server

import com.twitter.finagle.http.Status
import com.twitter.finatra.http.EmbeddedHttpServer
import com.twitter.inject.server.FeatureTest

class ApiServerTest extends FeatureTest {
  override val server = new EmbeddedHttpServer(twitterServer = new ApiServer)

  test("GET /ping") {
    server.httpGet("/ping", andExpect = Status.Ok, withBody = "pong")
  }
}
