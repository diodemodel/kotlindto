package com.kotlin.rioja.jasypt

import com.ulisesbocchio.jasyptspringboot.annotation.EncryptablePropertySource
import lombok.Value
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource

@Configuration
@EncryptablePropertySource("application.yml")
class JasyptConfig {

}