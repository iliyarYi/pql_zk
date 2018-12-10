// Generated from PQL.g4 by ANTLR 4.7.1
package org.pql.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PQLParser}.
 */
public interface PQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PQLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(PQLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(PQLParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#selectQuery}.
	 * @param ctx the parse tree
	 */
	void enterSelectQuery(PQLParser.SelectQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#selectQuery}.
	 * @param ctx the parse tree
	 */
	void exitSelectQuery(PQLParser.SelectQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#insertQuery}.
	 * @param ctx the parse tree
	 */
	void enterInsertQuery(PQLParser.InsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#insertQuery}.
	 * @param ctx the parse tree
	 */
	void exitInsertQuery(PQLParser.InsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(PQLParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(PQLParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PQLParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PQLParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#varName}.
	 * @param ctx the parse tree
	 */
	void enterVarName(PQLParser.VarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#varName}.
	 * @param ctx the parse tree
	 */
	void exitVarName(PQLParser.VarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(PQLParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(PQLParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(PQLParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(PQLParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#locations}.
	 * @param ctx the parse tree
	 */
	void enterLocations(PQLParser.LocationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#locations}.
	 * @param ctx the parse tree
	 */
	void exitLocations(PQLParser.LocationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(PQLParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(PQLParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#universe}.
	 * @param ctx the parse tree
	 */
	void enterUniverse(PQLParser.UniverseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#universe}.
	 * @param ctx the parse tree
	 */
	void exitUniverse(PQLParser.UniverseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(PQLParser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(PQLParser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#locationPath}.
	 * @param ctx the parse tree
	 */
	void enterLocationPath(PQLParser.LocationPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#locationPath}.
	 * @param ctx the parse tree
	 */
	void exitLocationPath(PQLParser.LocationPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#setOfTasks}.
	 * @param ctx the parse tree
	 */
	void enterSetOfTasks(PQLParser.SetOfTasksContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#setOfTasks}.
	 * @param ctx the parse tree
	 */
	void exitSetOfTasks(PQLParser.SetOfTasksContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#tasks}.
	 * @param ctx the parse tree
	 */
	void enterTasks(PQLParser.TasksContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#tasks}.
	 * @param ctx the parse tree
	 */
	void exitTasks(PQLParser.TasksContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#setOfAllTasks}.
	 * @param ctx the parse tree
	 */
	void enterSetOfAllTasks(PQLParser.SetOfAllTasksContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#setOfAllTasks}.
	 * @param ctx the parse tree
	 */
	void exitSetOfAllTasks(PQLParser.SetOfAllTasksContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#setOfTasksLiteral}.
	 * @param ctx the parse tree
	 */
	void enterSetOfTasksLiteral(PQLParser.SetOfTasksLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#setOfTasksLiteral}.
	 * @param ctx the parse tree
	 */
	void exitSetOfTasksLiteral(PQLParser.SetOfTasksLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#trace}.
	 * @param ctx the parse tree
	 */
	void enterTrace(PQLParser.TraceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#trace}.
	 * @param ctx the parse tree
	 */
	void exitTrace(PQLParser.TraceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(PQLParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(PQLParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#task}.
	 * @param ctx the parse tree
	 */
	void enterTask(PQLParser.TaskContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#task}.
	 * @param ctx the parse tree
	 */
	void exitTask(PQLParser.TaskContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#approximate}.
	 * @param ctx the parse tree
	 */
	void enterApproximate(PQLParser.ApproximateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#approximate}.
	 * @param ctx the parse tree
	 */
	void exitApproximate(PQLParser.ApproximateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(PQLParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(PQLParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#similarity}.
	 * @param ctx the parse tree
	 */
	void enterSimilarity(PQLParser.SimilarityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#similarity}.
	 * @param ctx the parse tree
	 */
	void exitSimilarity(PQLParser.SimilarityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#setOfTasksConstruction}.
	 * @param ctx the parse tree
	 */
	void enterSetOfTasksConstruction(PQLParser.SetOfTasksConstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#setOfTasksConstruction}.
	 * @param ctx the parse tree
	 */
	void exitSetOfTasksConstruction(PQLParser.SetOfTasksConstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#unaryPredicateConstruction}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPredicateConstruction(PQLParser.UnaryPredicateConstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#unaryPredicateConstruction}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPredicateConstruction(PQLParser.UnaryPredicateConstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#binaryPredicateConstruction}.
	 * @param ctx the parse tree
	 */
	void enterBinaryPredicateConstruction(PQLParser.BinaryPredicateConstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#binaryPredicateConstruction}.
	 * @param ctx the parse tree
	 */
	void exitBinaryPredicateConstruction(PQLParser.BinaryPredicateConstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#anyAll}.
	 * @param ctx the parse tree
	 */
	void enterAnyAll(PQLParser.AnyAllContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#anyAll}.
	 * @param ctx the parse tree
	 */
	void exitAnyAll(PQLParser.AnyAllContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#unaryPredicateName}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPredicateName(PQLParser.UnaryPredicateNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#unaryPredicateName}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPredicateName(PQLParser.UnaryPredicateNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#unaryTracePredicateName}.
	 * @param ctx the parse tree
	 */
	void enterUnaryTracePredicateName(PQLParser.UnaryTracePredicateNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#unaryTracePredicateName}.
	 * @param ctx the parse tree
	 */
	void exitUnaryTracePredicateName(PQLParser.UnaryTracePredicateNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#binaryPredicateName}.
	 * @param ctx the parse tree
	 */
	void enterBinaryPredicateName(PQLParser.BinaryPredicateNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#binaryPredicateName}.
	 * @param ctx the parse tree
	 */
	void exitBinaryPredicateName(PQLParser.BinaryPredicateNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(PQLParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(PQLParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#proposition}.
	 * @param ctx the parse tree
	 */
	void enterProposition(PQLParser.PropositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#proposition}.
	 * @param ctx the parse tree
	 */
	void exitProposition(PQLParser.PropositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#unaryPredicate}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPredicate(PQLParser.UnaryPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#unaryPredicate}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPredicate(PQLParser.UnaryPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#binaryPredicate}.
	 * @param ctx the parse tree
	 */
	void enterBinaryPredicate(PQLParser.BinaryPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#binaryPredicate}.
	 * @param ctx the parse tree
	 */
	void exitBinaryPredicate(PQLParser.BinaryPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#unaryTracePredicate}.
	 * @param ctx the parse tree
	 */
	void enterUnaryTracePredicate(PQLParser.UnaryTracePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#unaryTracePredicate}.
	 * @param ctx the parse tree
	 */
	void exitUnaryTracePredicate(PQLParser.UnaryTracePredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#unaryPredicateMacro}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPredicateMacro(PQLParser.UnaryPredicateMacroContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#unaryPredicateMacro}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPredicateMacro(PQLParser.UnaryPredicateMacroContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#binaryPredicateMacro}.
	 * @param ctx the parse tree
	 */
	void enterBinaryPredicateMacro(PQLParser.BinaryPredicateMacroContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#binaryPredicateMacro}.
	 * @param ctx the parse tree
	 */
	void exitBinaryPredicateMacro(PQLParser.BinaryPredicateMacroContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#binaryPredicateMacroTaskSet}.
	 * @param ctx the parse tree
	 */
	void enterBinaryPredicateMacroTaskSet(PQLParser.BinaryPredicateMacroTaskSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#binaryPredicateMacroTaskSet}.
	 * @param ctx the parse tree
	 */
	void exitBinaryPredicateMacroTaskSet(PQLParser.BinaryPredicateMacroTaskSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#binaryPredicateMacroSetSet}.
	 * @param ctx the parse tree
	 */
	void enterBinaryPredicateMacroSetSet(PQLParser.BinaryPredicateMacroSetSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#binaryPredicateMacroSetSet}.
	 * @param ctx the parse tree
	 */
	void exitBinaryPredicateMacroSetSet(PQLParser.BinaryPredicateMacroSetSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#anyEachAll}.
	 * @param ctx the parse tree
	 */
	void enterAnyEachAll(PQLParser.AnyEachAllContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#anyEachAll}.
	 * @param ctx the parse tree
	 */
	void exitAnyEachAll(PQLParser.AnyEachAllContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#setPredicate}.
	 * @param ctx the parse tree
	 */
	void enterSetPredicate(PQLParser.SetPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#setPredicate}.
	 * @param ctx the parse tree
	 */
	void exitSetPredicate(PQLParser.SetPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#taskInSetOfTasks}.
	 * @param ctx the parse tree
	 */
	void enterTaskInSetOfTasks(PQLParser.TaskInSetOfTasksContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#taskInSetOfTasks}.
	 * @param ctx the parse tree
	 */
	void exitTaskInSetOfTasks(PQLParser.TaskInSetOfTasksContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#setComparison}.
	 * @param ctx the parse tree
	 */
	void enterSetComparison(PQLParser.SetComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#setComparison}.
	 * @param ctx the parse tree
	 */
	void exitSetComparison(PQLParser.SetComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#setComparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterSetComparisonOperator(PQLParser.SetComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#setComparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitSetComparisonOperator(PQLParser.SetComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#truthValue}.
	 * @param ctx the parse tree
	 */
	void enterTruthValue(PQLParser.TruthValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#truthValue}.
	 * @param ctx the parse tree
	 */
	void exitTruthValue(PQLParser.TruthValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#logicalTest}.
	 * @param ctx the parse tree
	 */
	void enterLogicalTest(PQLParser.LogicalTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#logicalTest}.
	 * @param ctx the parse tree
	 */
	void exitLogicalTest(PQLParser.LogicalTestContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#union}.
	 * @param ctx the parse tree
	 */
	void enterUnion(PQLParser.UnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#union}.
	 * @param ctx the parse tree
	 */
	void exitUnion(PQLParser.UnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#intersection}.
	 * @param ctx the parse tree
	 */
	void enterIntersection(PQLParser.IntersectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#intersection}.
	 * @param ctx the parse tree
	 */
	void exitIntersection(PQLParser.IntersectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#difference}.
	 * @param ctx the parse tree
	 */
	void enterDifference(PQLParser.DifferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#difference}.
	 * @param ctx the parse tree
	 */
	void exitDifference(PQLParser.DifferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#negation}.
	 * @param ctx the parse tree
	 */
	void enterNegation(PQLParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#negation}.
	 * @param ctx the parse tree
	 */
	void exitNegation(PQLParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#isTrue}.
	 * @param ctx the parse tree
	 */
	void enterIsTrue(PQLParser.IsTrueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#isTrue}.
	 * @param ctx the parse tree
	 */
	void exitIsTrue(PQLParser.IsTrueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#isNotTrue}.
	 * @param ctx the parse tree
	 */
	void enterIsNotTrue(PQLParser.IsNotTrueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#isNotTrue}.
	 * @param ctx the parse tree
	 */
	void exitIsNotTrue(PQLParser.IsNotTrueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#isFalse}.
	 * @param ctx the parse tree
	 */
	void enterIsFalse(PQLParser.IsFalseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#isFalse}.
	 * @param ctx the parse tree
	 */
	void exitIsFalse(PQLParser.IsFalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#isNotFalse}.
	 * @param ctx the parse tree
	 */
	void enterIsNotFalse(PQLParser.IsNotFalseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#isNotFalse}.
	 * @param ctx the parse tree
	 */
	void exitIsNotFalse(PQLParser.IsNotFalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void enterDisjunction(PQLParser.DisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void exitDisjunction(PQLParser.DisjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(PQLParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(PQLParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#parentheses}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(PQLParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#parentheses}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(PQLParser.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#setOfTasksParentheses}.
	 * @param ctx the parse tree
	 */
	void enterSetOfTasksParentheses(PQLParser.SetOfTasksParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#setOfTasksParentheses}.
	 * @param ctx the parse tree
	 */
	void exitSetOfTasksParentheses(PQLParser.SetOfTasksParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#identical}.
	 * @param ctx the parse tree
	 */
	void enterIdentical(PQLParser.IdenticalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#identical}.
	 * @param ctx the parse tree
	 */
	void exitIdentical(PQLParser.IdenticalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#different}.
	 * @param ctx the parse tree
	 */
	void enterDifferent(PQLParser.DifferentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#different}.
	 * @param ctx the parse tree
	 */
	void exitDifferent(PQLParser.DifferentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#overlapsWith}.
	 * @param ctx the parse tree
	 */
	void enterOverlapsWith(PQLParser.OverlapsWithContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#overlapsWith}.
	 * @param ctx the parse tree
	 */
	void exitOverlapsWith(PQLParser.OverlapsWithContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#subsetOf}.
	 * @param ctx the parse tree
	 */
	void enterSubsetOf(PQLParser.SubsetOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#subsetOf}.
	 * @param ctx the parse tree
	 */
	void exitSubsetOf(PQLParser.SubsetOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link PQLParser#properSubsetOf}.
	 * @param ctx the parse tree
	 */
	void enterProperSubsetOf(PQLParser.ProperSubsetOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link PQLParser#properSubsetOf}.
	 * @param ctx the parse tree
	 */
	void exitProperSubsetOf(PQLParser.ProperSubsetOfContext ctx);
}