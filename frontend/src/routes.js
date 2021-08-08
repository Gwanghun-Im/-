

import Login from './views/user/Login.vue'
import Join from './views/user/Join.vue'
import ChangePassword from './views/user/ChangePassword.vue'
import JoinComplete from './views/user/JoinComplete.vue'
import FeedMain from './views/feed/Main.vue'
import Components from './views/Components.vue'
import Pagenotfound from './views/error/PageNotFound.vue'
import ErrorPage from './views/error/ErrorPage.vue'
import Profile from './views/profile/Profile.vue'
import Update from './views/user/Update.vue'
import Findpw from './views/user/Findpw.vue'
import Recipewrite from './views/recipe/Write.vue'
import FollowingList from './views/profile/FollowingList.vue'
import FollowerList from './views/profile/FollowerList.vue'
import Fileupload from './views/recipe/Fileupload.vue'
import RecipeDetail from './views/recipe/RecipeDetail.vue'
import Allmember from './views/feed/Allmember.vue'
import AchieveList from './views/achieve/AchieveList.vue'
import Rankinglist from './views/ranking/ranking.vue'

import AchieveDetail from './views/achieve/AchieveDetail.vue';

export default [
    

    {
        path : '/',
        name : 'Login',
        component : Login
    },
    {
        path : '/user/join',
        name : 'Join',
        component : Join
    },
    {
        path : '/user/update',
        name : 'Update',
        component : Update
    },
    {
        path : '/feed/main',
        name : 'FeedMain',
        component : FeedMain
    },
    {
        path : '/components',
        name : 'Components',
        component : Components
    },
    {
        path:'/user/changepassword',
        name:'ChangePassword',
        component:ChangePassword
    },
    {
        path:'/user/join/complete',
        name:'JoinComplete',
        component:JoinComplete
    },
    {
        path:'/user/findpw',
        name:'Findpw',
        component:Findpw
    },
    {
        path: '/recipe/write',
        name: 'Recipewrite',
        component: Recipewrite
    },
    {
        path: '/user/followerlist/:user_id',
        name: 'FollowerList',
        component: FollowerList
    },
    {
        path: '/user/followinglist/:user_id',
        name: 'FollowingList',
        component: FollowingList
    },
    {
        path: '/user/profile/:user_id',
        name: 'Profile',
        component: Profile
    },
    {
        path: '/recipe/fileupload/:user_id',
        name: 'Fileupload',
        component: Fileupload
    },
    {
        path: '/recipe/:recipe_idx',
        name: 'RecipeDetail',
        component: RecipeDetail
    },
    {
        path: '/feed/allmember',
        name: 'Allmember',
        component: Allmember
    },
    {
        path: '*',
        redirect:'/404'
    },
    {
        path: '/404',
        component:Pagenotfound
    },
    {
        path:'/error',
        name:'ErrorPage',
        component:ErrorPage
    },
    {
        path:'/achievelist',
        name:'Achievelist',
        component:AchieveList
    },
    {
        path:'/ranking/rnakinglist',
        name:'Rankinglist',
        component:Rankinglist
    },

    {
        path: '/achievelist/:idx',
        name: 'AchieveDetail',
        component: AchieveDetail,
    },

    

]
