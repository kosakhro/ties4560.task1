window.onload = customize;

function checkAnswer(){
    var country = window.document.getElementById('countries').value;
    var capital =  window.document.getElementById('capitalInput').value;
    var str = "country=" + country + "&capital=" + capital;
    doAjax("Servlet", str, "checkAnswer_back", "post", 0);
}
      
function checkAnswer_back(result){
    window.document.getElementById("answer").value = result;
}
