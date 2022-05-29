var button = $('button');

button.on("click", openCookie);

function openCookie(){
  if (document.getElementbyId("clickAndOpenCookie").src == "closed_cookie.png"){
    document.getElementbyId("clickAndOpenCookie").src = "open_cookie.png";
  } else {
    document.getElementbyId("clickAndOpenCookie").src = "closed_cookie.png";
  }
  
}
