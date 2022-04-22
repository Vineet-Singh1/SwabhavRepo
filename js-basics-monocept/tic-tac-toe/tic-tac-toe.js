var turn = 1;
var win = -1;
var lastTurn = 0;
var clickCounter = 0;
var matrix = [
    [-1, -1, -1],
    [-1, -1, -1],
    [-1, -1, -1]
]
function playerAction(elem, row, col) {

    if (elem.innerHTML != '')
        return;
    if (win != -1)
        return;
    clickCounter++;
    matrix[row][col] = turn;
    if (turn == 1) {
        elem.innerHTML = "X";
        document.getElementById('messagesection').innerHTML = "Player 2 Turn";
        turn = 2;
        lastTurn = 1;
    }
    else if (turn == 2) {
        elem.innerHTML = "O";
        document.getElementById('messagesection').innerHTML = "Player 1 Turn";
        turn = 1;
        lastTurn = 2;
    }
    for (var i = 0; i < 3; i++) {
        if (matrix[i][0] == matrix[i][1] && matrix[i][1] == matrix[i][2]) {
            if (matrix[i][0] != -1) {
                console.log('inside rol')
                win = matrix[i][0];
            }
        }
        if (matrix[0][i] == matrix[1][i] && matrix[1][i] == matrix[2][i]) {
            if (matrix[0][i] != -1) {
                console.log('inside col')
                win = matrix[0][i];
            }
        }
        if (matrix[0][0] == matrix[1][1] && matrix[1][1]== matrix[2][2]) {
            if (matrix[0][0] != -1) {
                console.log('inside diag1')
                win = matrix[0][0];
            }
        }

        if (matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0]) {
            if (matrix[0][2] != -1) {
                console.log('inside diag2')
                win = matrix[0][2];
            }
        }

        if (win != -1) {
            document.getElementById('messagesection').innerHTML = `Player ${lastTurn} has won`;
        }

        if (clickCounter == 9 && win == -1)
            document.getElementById('messagesection').innerHTML = `Match Drawn`;
            
    }
    console.log(matrix)
}