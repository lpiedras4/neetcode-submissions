class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        q = collections.deque()
        fresh = 0
        minutes = 0
        ROWS, COLS = len(grid), len(grid[0])
        for r in range(ROWS):
            for c in range(COLS):
                if grid[r][c] == 1:
                    fresh+=1
                if grid[r][c] == 2:
                    q.append((r,c))
        directions = [[1,0],[-1,0],[0,1],[0,-1]]
        while q and fresh > 0:
            for i in range(len(q)):
                qr,qc = q.popleft()
                for dr, dc in directions:
                    cr,cc = dr + qr, dc + qc
                    if (cr in range(ROWS) and cc in range(COLS) and grid[cr][cc] == 1):
                        grid[cr][cc] = 2
                        q.append((cr,cc))
                        fresh-=1
                        
            minutes+=1
        return minutes if fresh == 0 else -1