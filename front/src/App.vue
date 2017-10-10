<template>
  <div id="app" class="e-content">
    <h2>Submit a new feature</h2>
    <new-feature></new-feature>
    <h2>Submitted Features</h2>
    <div class="sui-o-grid as--stretch">

      <div class="sui-o-grid__item as--1_2@md as--1_3@xl" v-for="(value, key) in sortedFeatures">
        <feature :key="key" :feature="value"></feature>
      </div>
    </div>

  </div>
</template>

<script>
  import { mapActions, mapGetters } from 'vuex';
  import Feature from './components/Feature.vue';
  import NewFeature from './components/NewFeature.vue';

  export default {
    components: {
      NewFeature,
      Feature },
    name: 'app',
    mounted() {
      this.fillAllFeatures();
    },
    computed: {
      ...mapGetters(['allFeatures']),
      sortedFeatures() {
        return this.allFeatures.sort((a, b) => a.score < b.score);
      },
    },
    methods: {
      ...mapActions(['fillAllFeatures']),
    },
  };
</script>

<style>

</style>
