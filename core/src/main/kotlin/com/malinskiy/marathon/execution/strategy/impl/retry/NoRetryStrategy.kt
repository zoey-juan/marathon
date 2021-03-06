package com.malinskiy.marathon.execution.strategy.impl.retry

import com.malinskiy.marathon.device.DevicePoolId
import com.malinskiy.marathon.execution.TestShard
import com.malinskiy.marathon.execution.strategy.RetryStrategy
import com.malinskiy.marathon.test.Test

class NoRetryStrategy : RetryStrategy {
    override fun process(devicePoolId: DevicePoolId, tests: Collection<Test>, testShard: TestShard): List<Test> {
        return emptyList()
    }

    override fun hashCode() = javaClass.canonicalName.hashCode()

    override fun equals(other: Any?): Boolean {
        if(other == null) return false
        val javaClass: Class<Any> = other.javaClass
        return this.javaClass.canonicalName == javaClass.canonicalName
    }
}
