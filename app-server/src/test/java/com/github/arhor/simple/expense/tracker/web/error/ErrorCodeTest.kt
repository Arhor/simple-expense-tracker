//package com.github.arhor.simple.expense.tracker.web.error
//
//import com.github.arhor.linden.dragon.tavern.config.LocalizationConfig
//import com.github.arhor.linden.dragon.tavern.web.error.temp.ErrorCode
//import org.assertj.core.api.Assertions.assertThat
//import org.junit.jupiter.params.ParameterizedTest
//import org.junit.jupiter.params.provider.EnumSource
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.context.MessageSource
//import org.springframework.test.context.junit.jupiter.SpringJUnitConfig
//import java.util.Locale
//
//@SpringJUnitConfig(LocalizationConfig::class)
//internal class ErrorCodeTest {
//
//    @Autowired
//    private lateinit var messages: MessageSource
//
//    @EnumSource(ErrorCode::class)
//    @ParameterizedTest(name = "should have localization for {arguments} error code")
//    fun each_error_code_label_should_be_translated(code: ErrorCode) {
//        // given
//        val label = code.label
//        val args = emptyArray<Any>()
//        val locale = Locale.ENGLISH
//
//        // when
//        val message = messages.getMessage(label, args, locale)
//
//        // then
//        assertThat(message)
//            .isNotBlank
//    }
//
//    @EnumSource(ErrorCode.Type::class)
//    @ParameterizedTest(name = "should not have duplicate numeric values within {arguments} type")
//    fun each_error_code_type_should_not_have_numeric_value_duplicates(type: ErrorCode.Type) {
//        // when
//        val errorCodesByType = ErrorCode.values().filter { (it.type == type) }.toList()
//
//        // then
//        assertThat(errorCodesByType)
//            .extracting(ErrorCode::numericValue)
//            .doesNotHaveDuplicates()
//    }
//}
