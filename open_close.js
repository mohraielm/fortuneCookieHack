window.onload = function () {
  var Image_Id = document.getElementById("clickAndOpenCookie");
  var gen_fortune_btn = document.getElementById("generate_new");
  Image_Id.onclick = function openCookie() {
    if(Image_Id.src.match("closed_cookie.png")) {
      Image_Id.src = "open_cookie.png";
      document.getElementById("fortune").innerHTML = (random_fortunes(fortune_list));
    }
    else {
      gen_fortune_btn.onclick = function closeCookie() {
      Image_Id.src ="closed_cookie.png";
      }
    }
  }
}