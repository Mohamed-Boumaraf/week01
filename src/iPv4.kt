



fun main() {
    checkIp(
        name = "should return true when the IPv4 address is valid",
        answer = validateIp("192.168.1.1"),
        correctAnswer = true
    )

    checkIp(
        name = "should return true when the IPv4 address has '0' as a segment",
        answer = validateIp("0.0.0.0"),
        correctAnswer = true
    )

    checkIp(
        name = "should return true when the IPv4 address has 255 as a segment",
        answer = validateIp("255.255.255.255"),
        correctAnswer = true
    )






    checkIp(
        name = "should return false when the address has too many dots",
        answer = validateIp("192.168.1.1.1"),
        correctAnswer = false
    )

    checkIp(
        name = "should return false when the address has fewer than four segments",
        answer = validateIp("192.168.1"),
        correctAnswer = false
    )

    checkIp(
        name = "should return false when the address contains characters other than digits and dots",
        answer = validateIp("192:168,1.1"),
        correctAnswer = false
    )

    checkIp(
        name = "should return false when the address is an empty string",
        answer = validateIp(""),
        correctAnswer = false
    )

    checkIp(
        name = "should return false when the address contains only dots",
        answer = validateIp("...."),
        correctAnswer = false
    )


    checkIp(
        name = "should return false when the address contains non-numeric characters",
        answer = validateIp("192.168.A.1"),
        correctAnswer = false
    )

    checkIp(
        name = "should return false when the address contains extra spaces",
        answer = validateIp("192. 168.1.1"),
        correctAnswer = false
    )

    checkIp(
        name = "should return false when a segment has leading zeros",
        answer = validateIp("192.168.01.1"),
        correctAnswer = false
    )

    checkIp(
        name = "should return false when a segment is out of range (256)",
        answer = validateIp("256.255.255.255"),
        correctAnswer = false
    )















}

fun checkIp(name: String, answer: Boolean, correctAnswer: Boolean) {
    if (answer == correctAnswer) {
        println("✅ Success: $name")
    } else {
        println("❌ Failure: $name \t but got: $answer")
    }
}
