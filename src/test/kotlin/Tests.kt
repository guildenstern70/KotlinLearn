/*
 *  KOTLIN LEARN
 *
 *  MIT License (MIT)
 *  Copyright (c) 2015-2025 Alessio Saltarin
 *
 */

import net.littlelite.kotlinlearn.*
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import java.io.File

class Tests {
    @Before
    fun setUp() {
        // set up the test case
    }

    @After
    fun tearDown() {
        val tmpFile = File("tempfile.txt")
        if (tmpFile.exists()) tmpFile.delete()
    }

    @Test
    fun doubleEquality() {
        val d1 = 21.0
        val d2 = 21.0
        println("Double Equality = " + d1.equals(d2))
        assertEquals(d1, d2, 0.0)
    }

    @Test
    fun testSum() {
        println("Function test: 5 + 7 = " + sum(5, 7).toString())
        assertEquals(12, sum(5, 7))
    }

    @Test
    fun testSubtract() {
        val minus = substract(7, 5)
        println("Inline Function test: 7 - 5 = $minus")
        assertEquals(minus, 2)
    }

    @Test
    fun testCollections() {
        val sum = collections()
        println("Collections Test => Sum = $sum")
        assertEquals(sum, 300)
    }

    @Test
    fun testLoops() {
        val sum = loops()
        val sum2 = arraysWithIndices()
        val index = breakloop()
        assertEquals(sum, 100)
        assertEquals(sum2, 3)
        assertEquals(index, 1)
    }

    @Test
    fun testForEachIndexed() {
        val sum = forEachIndexed()
        println("For Each Indexed Test => Sum = $sum")
        assertEquals(sum, 3)
    }

    @Test
    fun testIfWhen() {
        val ifex = ifelse(4, 5)
        assertEquals(ifex, 5)
        val max = ifwhen(3, 4)
        println("IfWhen Test => Max = $max")
        assertEquals(max, 4)
    }

    @Test
    fun testClasses() {
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

    @Test
    fun testObjects() {
        val obj = SingletonObject
        obj.hello()
        SingletonObject.hello()
        assertEquals("234", SingletonObject.ID)
    }

    @Test
    fun testFiles() {
        createRandomTextFile()
        val tmpFile = File("tempfile.txt")
        assertTrue(tmpFile.exists())
        val result = sumContentsOfFile()
        assertTrue(result > 0)
        val lines = readFileLineByLine()
        assertTrue(lines == 1)
    }

    @Test
    fun testNullSafety() {
        NullSafety.storeWords()
        assertEquals(NullSafety.words.count(), 4)
    }

    @Test
    fun testCompanion() {
        val poly = Companion.create(4)
        assertEquals(poly.numberOfSides, 4)
    }

    @Test
    fun testDataClass() {
        val dc = UserDataClass("Alessio", "Saltarin", 45)
        println("UserDataClass Name: " + dc.component1())
        assertEquals("Alessio", dc.component1())
        assertEquals("Saltarin", dc.component2())
        assertEquals(45, dc.component3())
    }

    @Test
    fun testLambda() {
        assertEquals(16, lambdatest())
    }

    @Test
    fun testSuits() {
        val s1 = EnumSuit.HEART
        val s2 = EnumSuit.DIAMOND
        assertEquals("Diamonds", s2.toString())
        assertEquals("Hearts", s1.toString())
    }

    @Test
    fun testMapEach() {
        val valore = maps()
        assertTrue(valore.startsWith("X"))
        assertEquals(92, each())
        assertEquals(6, filter())
    }

    @Test
    fun testTake() {
        val value = take()
        assertEquals(1, value)
    }

    @Test
    fun testClosures() {
        val two = 2
        val four = 4
        assertEquals(6, highOrderFunction(two, four, ::sum))
        assertEquals(8, highOrderFunction(two, four, ::multiply))
        assertEquals(55, closure())
    }

    @Test
    fun testExtensions() {
        val str = "Trial"
        assertEquals("Trialpippo", str.addPippo())
    }

    @Test
    fun interfaces() {
        assertEquals(29, interfaceTest())
    }

    @Test
    fun testDates() {
        assertEquals(isoDate(), "2019-10-07T14:54Z")
    }

    @Test
    fun testHighOrderFunction() {
        val items = listOf(1, 2, 3, 4, 5)
        assertEquals(bendExample(items), 15)
    }

    @Test
    fun testDelegate() {
        assertEquals(windowArea(), 200)
    }

    @Test
    fun testBooleanReducer() {
        val booleans1 = listOf(true, true, false, true, false)
        assertEquals(booleanReducer(booleans1), true)
        val booleans2 = listOf(false, false, false, false, false)
        assertEquals(booleanReducer(booleans2), false)
        val booleans3 = listOf(false, false, true, false, false)
        assertEquals(booleanReducer(booleans3), true)
        val booleans4 = listOf(true, true, true, true, true)
        assertEquals(booleanReducer(booleans4), true)
    }

    @Test
    fun testApply() {
        assertEquals(applyBook(), "Dante Alighieri")
    }

    @Test
    fun testFunctional() {
        val deliveriesFunctional = functionalListTransform()
        val deliveriesNonFunctional = nonFunctional()
        assertEquals(deliveriesFunctional, deliveriesNonFunctional)
    }

    @Test
    fun testFunctionalPipes() {
        assertEquals(functionalIntPipes(1), 7)
        assertEquals(functionalStringPipes("Hello"), "SEVMTE8h")
    }

    @Test
    fun testFunctionalInputParameter() {
        assertEquals(testFip(10), 16)
    }

    @Test
    fun testFunctionalOutputParameter() {
        assertEquals(testFop(10), 15)
    }
}
