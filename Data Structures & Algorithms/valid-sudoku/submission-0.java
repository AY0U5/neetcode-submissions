class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char val = board[r][c];
                // On ignore les cases vides
                if (val == '.') {
                    continue;
                }
                // Calcul de l'indice du sous-bloc 3x3 (de 0 à 8)
                int boxIndex = (r / 3) * 3 + (c / 3);

            // Vérification des doublons dans la ligne, colonne ou bloc
                if (rows[r].contains(val) || cols[c].contains(val) ||                       boxes[boxIndex].contains(val)) {
                    return false;
                }

                // Ajout de la valeur aux ensembles respectifs
                rows[r].add(val);
                cols[c].add(val);
                boxes[boxIndex].add(val);
            }
        }
        return true;
    }
}
