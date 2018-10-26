package com.aeon.sys.json

import com.aeon.sys.model.Messages.{CustomerCreationFailed, CustomerCreationSuccess}
import spray.json.{DefaultJsonProtocol, RootJsonFormat}

object ApplicationJsonProtocol extends DefaultJsonProtocol {

  implicit val customerCreationSuccessJson: RootJsonFormat[CustomerCreationSuccess] = jsonFormat2(CustomerCreationSuccess)

  implicit val customerCreationFailedJson: RootJsonFormat[CustomerCreationFailed] = jsonFormat2(CustomerCreationFailed)

}
