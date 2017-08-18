package com.saagie.tooling.featurebrawl.infra

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class FeaturebrawlApplication


fun main(args: Array<String>) {
    SpringApplication.run(FeaturebrawlApplication::class.java, *args)
}
