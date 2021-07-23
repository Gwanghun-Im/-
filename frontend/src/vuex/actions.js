export default {
  login: function({commit}, res){
    commit('LOGIN',res)
  },
  logout: function({commit}, res){
    commit('LOGOUT',res)
  },
  writeRecipeItem({commit}, res){
    commit('WRITERECIPEITEM',res)
  },
  uploadImg({commit}, res){
    commit('UPLOADIMG',res)
  }
}
