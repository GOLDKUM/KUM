// JavaScript source code

//script에서
//한줄 주석
/*여러줄 주석 */
/*동적인 부분 (DB와 연동이 없는)*/
name = prompt("이름이 뭐니", "홍길동");
/*document는 화면*/
document.write(name + "~Welcome<br/>")

//동적인부분
function chk() {
    if (frm.tel.value.length < 4) {
        alert("전화번호는 뒷 4자리 이상 입력해야됨");
        return false;
    }
}