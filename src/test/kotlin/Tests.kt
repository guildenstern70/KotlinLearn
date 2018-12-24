/**
 *
 * KOTLIN LEARN
 *
 * MIT License (MIT)
 * Copyright (c) 2015-18 Alessio Saltarin
 *
 */

import net.littlelite.kotlinlearn.* // ktlint-disable no-wildcard-imports
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue

import org.junit.* // ktlint-disable no-wildcard-imports
import java.io.File

class Tests {

    @Before fun setUp() {
        // set up the test case
    }

    @After fun tearDown() {
        val tmpFile = File("tempfile.txt")
        if (tmpFile.exists()) tmpFile.delete()
    }

    @Test fun testSum() {
        println("Function test: 5 + 7 = " + sum(5, 7).toString())
        assertEquals(12, sum(5, 7))
    }

    @Test fun testSubtract() {
        val minus = substract(7, 5)
        println("Inline Function test: 7 - 5 = " + minus.toString())
        assertEquals(minus, 2)
    }

    @Test fun testCollections() {
        val sum = collections()
        println("Collections Test => Sum = " + sum.toString())
        assertEquals(sum, 241)
    }

    @Test fun testLoops() {
        val sum = loops()
        val sum2 = arraysWithIndices()
        val index = breakloop()
        assertEquals(sum, 100)
        assertEquals(sum2, 3)
        assertEquals(index, 1)
    }

    @Test fun testIfWhen() {
        val ifex = ifelse(4, 5)
        assertEquals(ifex, 5)
        val max = ifwhen(3, 4)
        println("IfWhen Test => Max = " + max.toString())
        assertEquals(max, 4)
    }

    @Test fun testClasses() {
        val alessio = Person()
        alessio.name = "Alessio"
        alessio.surname = "Saltarin"
        alessio.hello()
        val alessioStudente = Student(alessio)
        alessioStudente.hello()
        assertEquals("Alessio", alessioStudente.name)
        assertEquals("Saltarin", alessioStudente.surname)
        val alessioShortcut = StudentShortcut("Alessio", "Romani")
        assertEquals("Alessio", alessioShortcut.name)
    }

    @Test fun testObjects() {
        val obj = SingletonObject
        obj.hello()
        SingletonObject.hello()
        assertEquals("234", SingletonObject.id)
    }

    @Test fun testFiles() {
        createRandomTextFile()
        val tmpFile = File("tempfile.txt")
        assertTrue(tmpFile.exists())
        val result = sumContentsOfFile()
        assertTrue(result > 0)
        val lines = readFileLineByLine()
        assertTrue(lines == 1)
    }

    @Test fun testNullSafety() {
        NullSafety.storeWords()
        assertEquals(NullSafety.words.count(), 4)
    }

    @Test fun testCompanion() {
        val poly = Companion.create(4)
        assertEquals(poly.numberOfSides, 4)
    }

    @Test fun testDataClass() {
        val dc = UserDataClass("Alessio", "Saltarin", 45)
        println("UserDataClass Name: " + dc.component1())
        assertEquals("Alessio", dc.component1())
        assertEquals("Saltarin", dc.component2())
        assertEquals(45, dc.component3())
    }

    @Test fun testLambda() {
        assertEquals(16, lambdatest())
    }

    @Test fun testSuits() {
        val s1 = EnumSuit.HEART
        val s2 = EnumSuit.DIAMOND
        assertEquals("Diamonds", s2.toString())
        assertEquals("Hearts", s1.toString())
    }

    @Test fun testMapEach() {
        val valore = maps()
        assertTrue(valore.startsWith("X"))
        assertEquals(92, each())
        assertEquals(6, filter())
    }

    @Test fun testTake() {
        val value = take()
        assertEquals(1, value)
    }

    @Test fun testClosures() {
        val two = 2
        val four = 4
        assertEquals(6, highOrderFunction(two, four, ::sum))
        assertEquals(8, highOrderFunction(two, four, ::multiply))
        assertEquals(55, closure())
    }

    @Test fun testExtensions() {
        val str = "Trial"
        assertEquals("Trialpippo", str.addPippo(str))
    }

    @Test fun interfaces() {
        assertEquals(29, interfaceTest())
    }
}
