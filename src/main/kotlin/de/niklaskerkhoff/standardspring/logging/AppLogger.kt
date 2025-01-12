package de.niklaskerkhoff.standardspring.logging

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * Provides concise logging.
 */
interface AppLogger {
    val log: Logger get() = LoggerFactory.getLogger(javaClass)
}
