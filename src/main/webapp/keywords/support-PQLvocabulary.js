"use strict";
function blueKeywords() {
   return "SELECT|INSERT|INTO|FROM|WHERE|EQUALS|OVERLAPS|WITH|SUBSET|PROPER|GetTasks|NOT|AND|OR|ANY|EACH|ALL";
}

function booleanKeywords() {
    return "TRUE|FALSE";
}



function greyKeywords() {
    return "AVG|COUNT|MIN|MAX";
}

function greenKeywords() {
   return "CanOccur|AlwaysOccurs|Executes|Canconflict|CanCooccur|Conflict|Cooccur|TotalCasual|TotalConcurrent";
}