ace.define("ace/mode/pql_highlight_rules", ["require", "exports", "module", "ace/lib/oop", "ace/mode/text_highlight_rules"], function(e, t, n) {
    "use strict";
    var r = e("../lib/oop"),
        i = e("./text_highlight_rules").TextHighlightRules,
        s = function() {
            var e = blueKeywords(),
                t = booleanKeywords(),
                n = greyKeywords(),
                c = greenKeywords(),
                i = this.createKeywordMapper({
                    "support.function": n,
                    keyword: e,
                    "constant.language": t,
                    "keyword.custom": c,
                }, "identifier", false);
            this.$rules = {
                start: [{
                    token: "comment",
                    regex: "--.*$"
                }, {
                    token: "comment",
                    start: "/\\*",
                    end: "\\*/"
                }, {
                    token: "constant.numeric",
                    regex: "[+-]?\\d+(?:(?:\\.\\d*)?(?:[eE][+-]?\\d+)?)?\\b"
                }, {
                    token: i,
                    regex: "[a-zA-Z_$][a-zA-Z0-9_$]*\\b",
                    caseInsensitive: false
                }, {
                    token: "keyword.operator",
                    regex: "\\+|\\-|\\/|\\/\\/|%|<@>|@>|<@|&|\\^|~|<|>|<=|=>|==|!=|<>|="
                }, {
                    token: "paren.lparen",
                    regex: "[\\(]"
                }, {
                    token: "paren.rparen",
                    regex: "[\\)]"
                }, {
                    token: "text",
                    regex: "\\s+"
                }]
            }, this.normalizeRules()
        };
    r.inherits(s, i), t.PqlHighlightRules = s
}), ace.define("ace/mode/pql", ["require", "exports", "module", "ace/lib/oop", "ace/mode/text", "ace/mode/pql_highlight_rules"], function(e, t, n) {
    "use strict";
    var r = e("../lib/oop"),
        i = e("./text").Mode,
        s = e("./pql_highlight_rules").PqlHighlightRules,
        o = function() {
            this.HighlightRules = s, this.$behaviour = this.$defaultBehaviour
        };
    r.inherits(o, i),
        function() {
            this.lineCommentStart = "--", this.$id = "ace/mode/pql"
        }.call(o.prototype), t.Mode = o
});
(function() {
    ace.require(["ace/mode/pql"], function(m) {
        if (typeof module == "object" && typeof exports == "object" && module) {
            module.exports = m;
        }
    });
})();