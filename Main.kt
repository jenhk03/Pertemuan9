fun main()
{
//    Map
    val yearOfBirth = mapOf("Anna" to 1990, "Brian" to 1991, "Charles" to 1992, "Donna" to 1993)
    println(yearOfBirth)
    println(yearOfBirth.keys)
    println(yearOfBirth.values)
    println(yearOfBirth["Anna"])
    println(yearOfBirth.size)
    var gameScore = mutableMapOf("Anna" to 2, "Brian" to 2, "Charles" to 8, "Donna" to 6)
    println(gameScore)
    println(gameScore.keys)
    println(gameScore.values)
    println(gameScore.size)
    var pairs = HashMap<String, Int>()
    pairs = HashMap<String, Int>(20)
    println(gameScore["Charles"])
    println(gameScore["Elisa"])
    println(gameScore.get("Anna"))
    println(gameScore.get("Frank"))
    println(gameScore.isEmpty())
    println(gameScore.size)
    val bobData = mutableMapOf("name" to "Bob", "profession" to "CardPlayer", "country" to "USA")
    println(bobData)
    bobData.put("state", "NY")
    println(bobData)
    bobData["city"] = "New York"
    println(bobData)
    bobData.put("name", "Bobby")
    println(bobData)
    bobData["profession"] = "Mailman"
    println(bobData)
    val pairData = "nickname" to "Bobby N"
    bobData += pairData
    println(bobData)
    bobData.remove("city")
    bobData.remove("state", "NY")
    println(bobData)
    for ((player, score) in gameScore)
    {
        println("$player - $score")
    }
    for (player in gameScore.keys)
    {
        println("$player, ")
    }
    println()

//    Set
    val names = setOf("Anna", "Brian", "Charles", "Anna")
    println(names)
    val hashSet = HashSet<Int>()
    val arrayNumber = arrayOf(1, 2, 3, 1)
    var setNumber = mutableSetOf(*arrayNumber)
    println(setNumber)
    println(setNumber.contains(1))
    println(4 in setNumber)
    setNumber.add(5)
    println(setNumber)
    val removedOne = setNumber.remove(5)
    println(removedOne)
    println(setNumber)
}