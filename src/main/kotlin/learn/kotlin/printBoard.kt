package learn.kotlin

fun printBoard():String{
    var board = "|"
    for (i in 0..3) {
        for (j in 0..8) {
            board += "-"
        }
        board += "|\n|\n|"
    }
    return board
}