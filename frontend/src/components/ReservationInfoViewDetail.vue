<template>

    <v-card outlined>
        <v-card-title>
            ReservationInfo # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <Number label="HostId" v-model="item.hostId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="RoomId" v-model="item.roomId" :editMode="editMode" @change="change" />
            </div>
            <LongList offline label="UserIds" v-model="item.userIds" :editMode="false" @change="change" />
            <div>
                <String label="ReserveName" v-model="item.reserveName" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="RoomName" v-model="item.roomName" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="RoomUsed" v-model="item.roomUsed" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'ReservationInfoViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/reservationInfos/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

