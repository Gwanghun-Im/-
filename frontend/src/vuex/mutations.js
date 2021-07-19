export default {
  LOGIN: function(state, res){
    const token = res.data.token
    state.token = token
  },
  LOGOUT: function(state){
    state.token = ''
  },
}