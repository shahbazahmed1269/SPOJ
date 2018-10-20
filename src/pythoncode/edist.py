# Warning: Gave TLE when using python 3.5, got accepted by using Java. Check my solution in java.
def edit_distance(from_str, to_str):
    len_from = len(from_str)
    len_to = len(to_str)
    min_dist = [[0] * (len_from + 1) for x in range(len_to + 1)]

    for i in range(len_to + 1):
        for j in range(len_from + 1):
            if i == 0:
                min_dist[i][j] = j
            elif j == 0:
                min_dist[i][j] = i
            elif to_str[i-1] == from_str[j-1]:
                min_dist[i][j] = min_dist[i-1][j-1]
            else:
                min_dist[i][j] = min(min_dist[i][j-1]+1, min_dist[i-1][j-1]+1, min_dist[i-1][j]+1)
    print(min_dist[len_to][len_from])

def main():
    t = int(input())
    for i in range(t):
        from_str = input()
        to_str = input()
        edit_distance(from_str, to_str)

if __name__=="__main__":
    main()