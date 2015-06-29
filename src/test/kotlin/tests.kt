/**
 *
 * KOTLIN LEARN
 *
 * MIT License (MIT)
 * Copyright (c) 2015 Alessio Saltarin
 *
 */


import net.littlelite.kotlinlearn.*
import kotlin.test.*

import org.junit.Test
import junit.framework.TestCase
import org.junit.After
import org.junit.Before
import java.io.File


public class Tests {

    Before fun setUp() {
        // set up the test case
    }

    After fun tearDown() {
        val tmpFile = File("tempfile.txt")
        if (tmpFile.exists()) tmpFile.delete()
    }


    Test fun TestSum() {

        println("Function test: 5+7=" + sum(5,7).toString())
        assertEquals(12, sum(5,7))

    }

    Test fun TestSubtract() {

        val minus = substract(7,5)
        println("Inline Function test: 7-5=" + minus.toString())
        assertEquals(minus, 2)

    }

    Test fun TestCollections() {

        val sum = collections()
        println("Collections Test => Sum = "+sum.toString())
        assertEquals(sum, 138)

    }

    Test fun TestLoops() {

        val sum = loops()
        println("Loops Test => Sum = "+sum.toString())
        assertEquals(sum, 100)

    }

    Test fun TestIfWhen() {

        val max = ifwhen(3,4)
        println("IfWhen Test => Max = "+max.toString())
        assertEquals(max, 4)

    }

    Test fun TestClasses() {

        val alessio = Person()
        alessio.name = "Alessio"
        alessio.surname = "Saltarin"
        alessio.hello()
        var alessioStudente = Student(alessio)
        alessioStudente.hello()
        assertEquals("Alessio", alessioStudente.name)
        assertEquals("Saltarin", alessioStudente.surname)

    }

    Test fun TestObjects() {
        val obj = AnObject
        obj.hello()
        AnObject.hello()
        assertEquals("234", AnObject.id)
    }

    Test fun TestFiles() {
        createRandomTextFile()
        val tmpFile = File("tempfile.txt")
        assertTrue(tmpFile.exists())
        val result = sumContentsOfFile()
        assertTrue(result > 0)
    }

    Test fun TestNullSafety() {
        NullSafety.storeWords()
        assertEquals(NullSafety.words.count(), 4)
    }

    Test fun TestCompanion() {
        val poly = Polygon.create(4)
        assertEquals(poly.numberOfSides, 4)
    }

    Test fun TestDataClass() {
        val dc = User("Alessio", "Saltarin", 45)
        println("User Name: " + dc.component1())
        assertEquals("Alessio", dc.component1())
        assertEquals("Saltarin", dc.component2())
        assertEquals(45, dc.component3())
    }
}

