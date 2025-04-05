




fun main (){


}


fun validateSudoku(board: List<List<Char>>): Boolean {
 if (board.size != 9) return false
 for (row in board) {
  if (row.size != 9) return false
 }

 val allowedChars = listOf('1','2','3','4','5','6','7','8','9','-')
 for (row in board) {
  for (cell in row) {
   if (cell !in allowedChars) return false
  }
 }

 for (row in board) {
  val seen = mutableListOf<Char>()
  for (c in row) {
   if (c != '-' && c in seen) return false
   if (c != '-') seen.add(c)
  }
 }

 for (col in 0 until 9) {
  val seen = mutableListOf<Char>()
  for (row in 0 until 9) {
   val value = board[row][col]
   if (value != '-' && value in seen) return false
   if (value != '-') seen.add(value)
  }
 }

 // this is not a dynamic idea !
 for (startRow in listOf(0, 3, 6)) {
  for (startCol in listOf(0, 3, 6)) {
   val seen = mutableListOf<Char>()
   for (r in startRow until startRow + 3) {
    for (c in startCol until startCol + 3) {
     val value = board[r][c]
     if (value != '-' && value in seen) return false
     if (value != '-') seen.add(value)
    }
   }
  }
 }

 return true
}

