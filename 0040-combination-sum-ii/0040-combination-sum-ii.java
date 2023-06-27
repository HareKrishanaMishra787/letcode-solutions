class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> combinations = new ArrayList<>();
        generateCombinations(0, target, candidates, combinations, new ArrayList<>());
        return combinations;
    }

    public void generateCombinations(int index, int target, int[] candidates, List<List<Integer>> combinations, List<Integer> currentCombination) {
        if (target == 0) {
            combinations.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (i != index && candidates[i] == candidates[i - 1])
                continue;
            if (candidates[i] > target)
                break;

            currentCombination.add(candidates[i]);
            generateCombinations(i + 1, target - candidates[i], candidates, combinations, currentCombination);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}
