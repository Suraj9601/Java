arr = [1,2,2,3,4,5,6,6,6,7]
newarr = []

for ele in arr:
    if ele not in newarr:
        newarr.append(ele);

print(newarr)

# str = "Hello my Name is Surajaglave"
# dicti = {}

# for word in str.split():
#     dicti[word] = len(word)

# print(max(dicti, key=dicti.get))