
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import MeetingRoomManager from "./components/listers/MeetingRoomCards"
import MeetingRoomDetail from "./components/listers/MeetingRoomDetail"

import UserListManager from "./components/listers/UserListCards"
import UserListDetail from "./components/listers/UserListDetail"

import ConferenceManager from "./components/listers/ConferenceCards"
import ConferenceDetail from "./components/listers/ConferenceDetail"



import ReservationInfoView from "./components/ReservationInfoView"
import ReservationInfoViewDetail from "./components/ReservationInfoViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/meetingRooms',
                name: 'MeetingRoomManager',
                component: MeetingRoomManager
            },
            {
                path: '/meetingRooms/:id',
                name: 'MeetingRoomDetail',
                component: MeetingRoomDetail
            },

            {
                path: '/userLists',
                name: 'UserListManager',
                component: UserListManager
            },
            {
                path: '/userLists/:id',
                name: 'UserListDetail',
                component: UserListDetail
            },

            {
                path: '/conferences',
                name: 'ConferenceManager',
                component: ConferenceManager
            },
            {
                path: '/conferences/:id',
                name: 'ConferenceDetail',
                component: ConferenceDetail
            },



            {
                path: '/reservationInfos',
                name: 'ReservationInfoView',
                component: ReservationInfoView
            },
            {
                path: '/reservationInfos/:id',
                name: 'ReservationInfoViewDetail',
                component: ReservationInfoViewDetail
            },


    ]
})
