package com.malinskiy.marathon.execution.strategy

import com.malinskiy.marathon.test.Test
import com.malinskiy.marathon.test.TestBatch
import java.util.*

interface BatchingStrategy {
    fun process(queue: Queue<Test>): TestBatch
}
