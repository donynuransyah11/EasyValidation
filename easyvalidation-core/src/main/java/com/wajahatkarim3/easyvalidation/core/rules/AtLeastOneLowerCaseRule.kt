package com.wajahatkarim3.easyvalidation.core.rules

import com.wajahatkarim3.easyvalidation.core.Validator

/**
 * Returns true if atleast one or more characters are lower case
 *
 * @author Wajahat Karim
 */
class AtLeastOneLowerCaseRule : BaseRule
{
    override fun validate(text: String): Boolean = Validator(text).regex("[A-Z0-9]+").check()

    override fun getErrorMessage(): String = "At least one letter should be in lower case."
}