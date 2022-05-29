var enough_money = 1;
var money = 1; 
var ticket = 0;

function add() { //This function is what makes the button add!
  money++;
  document.getElementById("money").innerHTML = "Money: $" + money; 
}

var buy_ticket = document.getElementById("ticket");
buy_ticket.onclick = function buyticket() {
  while (money >= 10) {
    ticket++;
    document.getElementById("money").innerHTML = "Money: $" + (money - 10);
    document.getElementById("ticket-value").innerHTML = "Ticket: " + ticket;
  } if (money < 10) {
      alert("No money available!");
    }
  money++;
  }

  //if(money >= 10) {
  	//ticket++;
   // document.getElementById("money").innerHTML = "Money: $" + (money - 10);
    //document.getElementById("ticket-value").innerHTML = "Ticket: " + ticket;
 // }
 // else{
  //  if(money < 10){
   //   alert("No money available!");
  //  }
  //}

// while (money >= 10){
//   ticket++;
//     document.getElementById("money").innerHTML = "Money: $" + (money - 10);
//     document.getElementById("ticket-value").innerHTML = "Ticket: " + ticket;
// } if(money < 10){
//   alert("No money available!");
// }