package com.aeon.sys.model


object Messages {

  trait DomainMessage

  case class CustomerCreationSuccess(status: Int, message: Option[String] = Some("success")) extends DomainMessage

  case class CustomerCreationFailed(status: Int, message: Option[String] = Some("failed")) extends DomainMessage

}