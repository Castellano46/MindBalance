package com.example.mindbalance.ui.screens.unauthenticated.registration.state

import com.example.mindbalance.R
import com.example.mindbalance.ui.common.state.ErrorState

val emailEmptyErrorState = ErrorState(
    hasError = true,
    errorMessageStringResource = R.string.registration_error_msg_empty_email
)

val mobileNumberEmptyErrorState = ErrorState(
    hasError = true,
    errorMessageStringResource = R.string.registration_error_msg_empty_mobile
)

val passwordEmptyErrorState = ErrorState(
    hasError = true,
    errorMessageStringResource = R.string.registration_error_msg_empty_password
)

val confirmPasswordEmptyErrorState = ErrorState(
    hasError = true,
    errorMessageStringResource = R.string.registration_error_msg_empty_confirm_password
)

val passwordMismatchErrorState = ErrorState(
    hasError = true,
    errorMessageStringResource = R.string.registration_error_msg_password_mismatch
)
