/**
 * OpenAPI Petstore *_/ ' \" =end -- \\r\\n \\n \\r
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  *_/ ' \" =end --       
 *
 * OpenAPI spec version: 1.0.0 *_/ ' \" =end -- \\r\\n \\n \\r
 * Contact: something@something.abc *_/ ' \" =end -- \\r\\n \\n \\r
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api

import java.text.SimpleDateFormat

import org.openapitools.client.model.UNKNOWN_BASE_TYPE
import org.openapitools.client.{ApiInvoker, ApiException}

import collection.mutable
import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart
import com.wordnik.swagger.client._
import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._
import javax.ws.rs.core.Response.Status.Family

import java.net.URI
import java.io.File
import java.util.Date
import java.util.TimeZone
import javax.ws.rs.core.{MediaType, Response}

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.collection.mutable.HashMap
import scala.util.{Failure, Success, Try}

import org.json4s._

class FakeApi(
  val defBasePath: String = "http://petstore.swagger.io *_/ ' \" =end -- \\r\\n \\n \\r/v2 *_/ ' \" =end -- \\r\\n \\n \\r",
  defApiInvoker: ApiInvoker = ApiInvoker
) {
  private lazy val dateTimeFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  private val dateFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = dateTimeFormatter
  }
  implicit val stringReader: ClientResponseReader[String] = ClientResponseReaders.StringReader
  implicit val unitReader: ClientResponseReader[Unit] = ClientResponseReaders.UnitReader
  implicit val jvalueReader: ClientResponseReader[JValue] = ClientResponseReaders.JValueReader
  implicit val jsonReader: ClientResponseReader[Nothing] = JsonFormatsReader
  implicit val stringWriter: RequestWriter[String] = RequestWriters.StringWriter
  implicit val jsonWriter: RequestWriter[Nothing] = JsonFormatsWriter

  var basePath: String = defBasePath
  var apiInvoker: ApiInvoker = defApiInvoker

  def addHeader(key: String, value: String): mutable.HashMap[String, String] = {
    apiInvoker.defaultHeaders += key -> value
  }

  val config: SwaggerConfig = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new FakeApiAsyncHelper(client, config)

  /**
   * To test code injection *_/ &#39; \&quot; &#x3D;end -- \\r\\n \\n \\r
   * To test code injection *_/ &#39; \&quot; &#x3D;end -- \\r\\n \\n \\r
   *
   * @param UNKNOWN_BASE_TYPE  (optional)
   * @return void
   */
  def testCodeInject * &#39; &quot; &#x3D;end  rn n r(UNKNOWN_BASE_TYPE: Option[UNKNOWN_BASE_TYPE] = None) = {
    val await = Try(Await.result(testCodeInject * &#39; &quot; &#x3D;end  rn n rAsync(UNKNOWN_BASE_TYPE), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * To test code injection *_/ &#39; \&quot; &#x3D;end -- \\r\\n \\n \\r asynchronously
   * To test code injection *_/ &#39; \&quot; &#x3D;end -- \\r\\n \\n \\r
   *
   * @param UNKNOWN_BASE_TYPE  (optional)
   * @return Future(void)
   */
  def testCodeInject * &#39; &quot; &#x3D;end  rn n rAsync(UNKNOWN_BASE_TYPE: Option[UNKNOWN_BASE_TYPE] = None) = {
      helper.testCodeInject * &#39; &quot; &#x3D;end  rn n r(UNKNOWN_BASE_TYPE)
  }

}

class FakeApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def testCodeInject * &#39; &quot; &#x3D;end  rn n r(UNKNOWN_BASE_TYPE: Option[UNKNOWN_BASE_TYPE] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[Option[UNKNOWN_BASE_TYPE]]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/fake"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(UNKNOWN_BASE_TYPE))
    resFuture flatMap { resp =>
      val status = Response.Status.fromStatusCode(resp.statusCode)
      status.getFamily match {
        case Family.SUCCESSFUL | Family.REDIRECTION | Family.INFORMATIONAL => process(reader.read(resp))
        case _ => throw new ApiException(resp.statusCode, resp.statusText)
      }
    }
  }


}
