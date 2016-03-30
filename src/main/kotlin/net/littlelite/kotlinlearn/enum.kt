package net.littlelite.kotlinlearn

/**
 * Enum class
 */
enum class Suit
{
    SPADE,
    CLUB,
    HEART,
    DIAMOND;

    override fun toString(): String
    {
        val suits : String

        when (this)
        {
            SPADE -> suits = "Spades";
            CLUB -> suits = "Clubs";
            HEART -> suits = "Hearts";
            else -> suits = "Diamonds"
        }

        return suits
    }


}
