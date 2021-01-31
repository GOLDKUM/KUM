// JavaScript source code
function sumAll() {
    var result = 0;
    if (arguments.length == 0) {
        return -999;
    } else {
        for (var cnt = 0; cnt < arguments.length; cnt++) {
            result = result + arguments[cnt];
        }
        return result;
    }
}