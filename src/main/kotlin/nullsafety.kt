
/**
 * Created by guildenstern1 on 23/06/15.
 */

package net.littlelite.kotlinlearn

import java.util.*

public object NullSafety {

    val given_words = "-ONE-,-TWO-,-THREE-,-FOUR-"
    var words = ArrayList<String>()

    public fun storeWords() {

        var sum=0

        val strTok = StringTokenizer(given_words, ",")
        while (strTok.hasMoreElements()) {
            val word: String = strTok.nextElement() as String
            this.words.add(this.stripVirg(word))
            sum++
        }
        println("Stored $sum words.")


    }

    private fun stripVirg(word: String) : String {

        return word.substring(1, word.length - 1)

    }

}

