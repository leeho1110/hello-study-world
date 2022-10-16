/*
 * kopringboot-multimodule-template
 * Distributed under MIT licence
 */
package com.flab.hsw.core.domain.user.exception

import com.flab.hsw.core.exception.ErrorCodes
import com.flab.hsw.core.exception.ExternalException

/**
 * @since 2021-08-10
 */
class SameLoginIdUserAlreadyExistException(
    val loginId: String,
    override val message: String = "User with login id('$loginId') already exists.",
    override val cause: Throwable? = null
) : ExternalException(ErrorCodes.USER_BY_LOGIN_ID_DUPLICATED, message, cause) {
    override fun messageArguments(): Collection<String> = setOf(loginId)
}
