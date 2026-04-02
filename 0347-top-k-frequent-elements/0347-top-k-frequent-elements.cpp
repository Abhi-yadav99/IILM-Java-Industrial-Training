class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        int n = nums.size();

        unordered_map<int, int> freq;
        for(int i=0; i<n; i++){
            freq[nums[i]]++;
        }

        vector<vector<int>> bucket(n+1);
        for(auto it : freq){
            int a = it.first;
            int b = it.second;

            bucket[b].push_back(a);
        }

        vector<int> ans;
        for(int i=n; i>=0 && ans.size() < k; i--){
            for(int num : bucket[i]){
                ans.push_back(num);
                if(ans.size() == k){
                    break;
                }
            }
        }

        return ans;
    }
};