package com.flab.hsw.endpoint.v1.user

import com.flab.hsw.endpoint.common.response.SimpleResponse
import com.flab.hsw.endpoint.v1.ApiPathsV1
import com.flab.hsw.endpoint.v1.user.login.UserLoginRequest
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import javax.servlet.http.HttpSession
import javax.validation.Valid

@RequestMapping(
    produces = [MediaType.APPLICATION_JSON_VALUE],
    consumes = [MediaType.APPLICATION_JSON_VALUE]
)
interface UserLoginController {
    @RequestMapping(
        path = [ApiPathsV1.USER_LOGIN],
        method = [RequestMethod.POST]
    )
    fun login(@Valid @RequestBody request: UserLoginRequest, session: HttpSession): SimpleResponse<Boolean>
}