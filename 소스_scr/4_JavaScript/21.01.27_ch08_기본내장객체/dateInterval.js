// JavaScript source code
//this.getInterval(that); this날과 that날 사이의 날짜 계산
Date.prototype.getInterval = function (that) {
    if (this > that) {
        var intervalMili = this.getTime() - that.getTime();
    } else {
        var intervalMili = that.getTime() - this.getTime();
    }
    var intervalDay = intervalMili / (1000 * 60 * 60 * 24);
    return Math.trunc(intervalDay);
};
