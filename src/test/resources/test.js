var scores = [1,5,2,3,6, 9];
var totalScores=0;
for(var i =0;i<scores.length;i++){
    totalScores+=scores[i];
}
var averageScore = totalScores/scores.length;
console.log("Total :"+totalScores +" AverageScore : "+averageScore.toFixed(2))